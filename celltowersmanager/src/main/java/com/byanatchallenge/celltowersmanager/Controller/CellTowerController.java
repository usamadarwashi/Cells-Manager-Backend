package com.byanatchallenge.celltowersmanager.Controller;

import com.byanatchallenge.celltowersmanager.Entity.CellTower;
import com.byanatchallenge.celltowersmanager.service.CellTowerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//This annotation marks the class CellTowerResource as a RESTful web controller. It means that this class is responsible for handling HTTP requests and producing HTTP responses.
@RestController
//This annotation specifies the base URL path ("/cellTower") for all the HTTP endpoints defined in this class. In other words, any HTTP request that starts with "/cellTower" will be handled by this controller.
@RequestMapping("/cellTower")
public class CellTowerController {
    //final: once the variable is assigned a value, it cannot be changed.
    //This declares a variable named cellTowerService of type CellTowerService. This variable will hold an instance of the CellTowerService class.
    private final CellTowerService cellTowerService;
    //Assigning the cellTowerService parameter to the cellTowerService field within the class in the constructor is a fundamental step in initializing an object properly.
    public CellTowerController(CellTowerService cellTowerService) {
        this.cellTowerService = cellTowerService;
    }

    //used to map a URL to a method in a web controller.
    @GetMapping("/all")
    //getAllCellTowers method returns list of cellTowers
    public ResponseEntity<List<CellTower>> getAllCellTowers(){
        //This line declares a variable named cellTowers of type List<CellTower> and assigns it the result of calling the findAllCellTowers method on the cellTowerService object. This method retrieves a list of CellTower objects.
        List<CellTower> cellTowers = cellTowerService.findAllCellTowers();
        return new ResponseEntity<>(cellTowers, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<CellTower> getCellTowerById(@PathVariable("id") Long id){
        CellTower cellTower = cellTowerService.findCellTowerById(id);
        return new ResponseEntity<>(cellTower, HttpStatus.OK);

    }

    @PostMapping("/add")
    public ResponseEntity<CellTower> addCellTower(@RequestBody CellTower cellTower){
        CellTower newCellTower = cellTowerService.addCellTower(cellTower);
        return new ResponseEntity<>(newCellTower, HttpStatus.CREATED);
    }

    @PostMapping("/add/isItValid")
    public ResponseEntity<Boolean> checkCellTower(@RequestBody CellTower cellTower) {
       Boolean dsa =  cellTowerService.checkCellTower(cellTower);
       if(dsa!=null)
            return new ResponseEntity<>(dsa, HttpStatus.OK);
        else{
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }
    }
    @PutMapping("/update")
    public ResponseEntity<CellTower> updateCellTower(@RequestBody CellTower cellTower){
        CellTower updateCellTower = cellTowerService.updateCellTower(cellTower);
        return new ResponseEntity<>(updateCellTower, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteCellTowerById(@PathVariable Long id){
        return new ResponseEntity<>(cellTowerService.deleteCellTower(id),HttpStatus.OK);
    }

    @GetMapping("/find/{id}/isItThere")
    public ResponseEntity<Boolean> checkCellTowerById(@PathVariable("id") Long id){
        CellTower cellTower = cellTowerService.findCellTowerById(id);

        if (cellTower != null) {
            return new ResponseEntity<>(true, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(false, HttpStatus.OK);
        }
    }


}
