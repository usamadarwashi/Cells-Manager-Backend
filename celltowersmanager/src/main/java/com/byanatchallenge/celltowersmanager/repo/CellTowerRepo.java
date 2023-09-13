package com.byanatchallenge.celltowersmanager.repo;

import com.byanatchallenge.celltowersmanager.model.CellTower;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CellTowerRepo extends JpaRepository<CellTower, Long> {
    void deleteCellTowerById(Long id);
    void deleteCellTowerByHeight(Long id);
    CellTower findCellTowerById(Long id);

}
