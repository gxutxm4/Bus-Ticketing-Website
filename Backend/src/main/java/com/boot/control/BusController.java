package com.boot.control;

import java.sql.Time;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.dao.BusRepository;
import com.boot.entity.Bus;
import com.boot.entity.BusLT;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BusController {
	
	@Autowired
	BusRepository busRepo;
	
	//Add BUS
	@PostMapping("/addBus")
	public void addBus(@RequestBody Bus bus) {
		busRepo.save(bus);
	}	
	
	//Get BUS
	@GetMapping("/getBusDetails")
	public List<Bus> getAllBusDetails(){
		return busRepo.findAll();
	}
	
	@GetMapping("/getBusDetailsbybusId/{busId}")
	public Bus getBusbybusId(@PathVariable int busId){
		return busRepo.getBusbyID(busId);
	}
//	getBusbyID
	
	@GetMapping("/getbySourceandDestination/{busSource}/{busDestination}")
	public List<Bus> getBusbySourceandDestination(@PathVariable String busSource, @PathVariable String busDestination){
		return busRepo.getBusbySourceandDestination(busSource, busDestination);
	}
	
	@GetMapping("/getBusDetailsbybpuId/{bpuId}")
	public List<Bus> getBusDetailsbybpuId(@PathVariable int bpuId){
		return busRepo.getBusbpuId(bpuId);
	}
	
	@GetMapping("/getBusbyBusNo/{busNo}")
	public Bus getBusbyBusNo(@PathVariable String BusNo) {
		return busRepo.getBusbyBusNo(BusNo);
	}
	
	//Update Bus
	@PutMapping("/updatebusSource/{busSource}/{busId}")
	public void updatebusSource(@PathVariable String busSource, @PathVariable int busId) {
		busRepo.getReferenceById(busId).setBusSource(busSource);
	}
	
	@PutMapping("/updatebusDestination/{busDestination}/{busId}")
	public void updatebusDestination(@PathVariable String busDestination, @PathVariable int busId) {
		busRepo.getReferenceById(busId).setBusDestination(busDestination);
	}
	
	@PutMapping("/updatebusFare/{busFare}/{busId}")
	public void updatebusFare(@PathVariable double busFare, @PathVariable int busId) {
		busRepo.getReferenceById(busId).setBusFare(busFare);
	}
	
	@PutMapping("/updatebusArrivalTime/{busArrivalTime}/{busId}")
	public void updatebusArrivalTime(@PathVariable Time busArrivalTime, @PathVariable int busId) {
		busRepo.getReferenceById(busId).setBusArrivalTime(busArrivalTime);
	}
	
	@PutMapping("/updatebusDepartureTime/{busDepartureTime}/{busId}")
	public void updatebusDepartureTime(@PathVariable Time busDepartureTime, @PathVariable int busId) {
		busRepo.getReferenceById(busId).setBusDeparturetime(busDepartureTime);
	}
	
	@PutMapping("/updatebusTotalSeats/{busTotalSeats}/{busId}")
	public void updatebusTotalSeats(@PathVariable int busTotalSeats, @PathVariable int busId) {
		busRepo.getReferenceById(busId).setBusTotalSeats(busTotalSeats);
	}
	
	@PutMapping("/updatebusPillow/{busPillow}/{busId}")
	public void updatebusPillow(@PathVariable boolean busPillow, @PathVariable int busId) {
		busRepo.getReferenceById(busId).setBusPillow(busPillow);
	}
	
	@PutMapping("/updatebusCharging/{busCharging}/{busId}")
	public void updatebusCharging(@PathVariable boolean busCharging, @PathVariable int busId) {
		busRepo.getReferenceById(busId).setBusCharging(busCharging);
	}
	
	@PutMapping("/updatebusCCTV/{busCCTV}/{busId}")
	public void updatebusCCTV(@PathVariable boolean busCCTV, @PathVariable int busId) {
		busRepo.getReferenceById(busId).setBusCCTV(busCCTV);
	}
	
	@PutMapping("/updatebusStopPoints/{busStopPoints}/{busId}")
	public void updatebusStopPoints(@RequestBody List<BusLT> busStopPoints, @PathVariable int busId) {
		busRepo.getReferenceById(busId).setBusStopPoints(busStopPoints);
	}
	
	@PutMapping("/updatebpuCompanyName/{bpuCompanyName}/{busId}")
	public void updatebpuCompanyName(@PathVariable String bpuCompanyName, @PathVariable int busId) {
		busRepo.getReferenceById(busId).setBpuCompanyName(bpuCompanyName);
	}
	
	//DeleteBus
	@DeleteMapping("/deleteBusbyId/{busId}")
	public void deleteBus(int busId) {
		busRepo.deleteById(busId);
	}
	
	@DeleteMapping("/deleteBusbyBusNo/{busNo}")
	public void deleteBusbyBusNo(@PathVariable String busNo) {
		busRepo.deleteBusbyBusNo(busNo);
	}
	
}
