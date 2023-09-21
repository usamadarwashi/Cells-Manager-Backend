package com.byanatchallenge.celltowersmanager.repo;

import com.byanatchallenge.celltowersmanager.Entity.CellTower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CellTowerRepo extends JpaRepository<CellTower, Long> {
    void deleteCellTowerById(Long id);
    CellTower findCellTowerById(Long id);

}
