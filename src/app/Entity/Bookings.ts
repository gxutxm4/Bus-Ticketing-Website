import { Time } from "@angular/common";

export class Bookings {
    
    bookingId:number;
	busId:number;
	userId:number;
	bpuId:number;
	bookingFare:number;
	

    constructor(bookingId:number, busId:number, userId:number, bpuId:number, bookingFare:number) {

            this.bookingId=bookingId;
            this.busId=busId;
            this.userId=userId;
            this.bpuId=bpuId;
            this.bookingFare=bookingFare;
        
    }

}