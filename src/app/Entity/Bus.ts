import { Time } from "@angular/common";
import { BusLT } from "./BusLT";

export class Bus {

    busId:number;
	bpuId:number;
	busNo:string;
	bpuCompanyName:string;
	busSource:string;
	busDestination:string;
	busFare:number;
	busDeparturetime:Time;
	busArrivalTime:Time;
	busTotalSeats:number;
	busPillow:boolean;
	busCCTV:boolean;
	busCharging:boolean;
	busPickupPoints:BusLT[];
	busDropPoints:BusLT[];
    
    constructor(busId:number, bpuId:number, busNo:string, busSource:string, busDestination:string, busFare:number, bpuCompanyName:string,
        busDeparturetime:Time, busArrivalTime:Time, busTotalSeats:number, busPillow:boolean, busCCTV:boolean, 
        busCharging:boolean, busPickupPoints:BusLT[], busDropPoints:BusLT[]) {
        

            this.busId=busId;
	        this.bpuId=bpuId;
	        this.busNo=busNo;
			this.bpuCompanyName=bpuCompanyName;
	        this.busSource=busSource;
	        this.busDestination=busDestination;
	        this.busFare=busFare;
	        this.busDeparturetime=busDeparturetime;
	        this.busArrivalTime=busArrivalTime;
	        this.busTotalSeats=busTotalSeats;
	        this.busPillow=busPillow;
	        this.busCCTV=busCCTV;
	        this.busCharging=busCharging;
	        this.busPickupPoints=busPickupPoints;
	        this.busDropPoints=busDropPoints;
            
    }
}