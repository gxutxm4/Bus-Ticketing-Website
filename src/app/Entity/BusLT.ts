import { Time } from "@angular/common";

export class BusLT {
    
    busLTId:number;
	location:string;
	time:Time;

    constructor(busLTId:number, location:string, time:Time) {
        this.busLTId=busLTId;
        this.location=location;
        this.time=time;
    }
}