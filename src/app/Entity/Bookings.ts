import { Time } from "@angular/common";

export class Bookings {
    
    bookingId:number;
	busId:number;
	userId:number;
	bpuId:number;
	bookingsource:string;
	bookingDestination:string;
	bookingFare:number;
	bookingPickupPointLocation:string;
	bookingPickupPointTime:Time;
	bookingDropPointLocation:string;
	bookingDropPointTime:Time;
	bookingTime:Time;

    constructor(bookingId:number, busId:number, userId:number, bpuId:number, bookingsource:string, bookingDestination:string,
        bookingFare:number, bookingPickupPointLocation:string, bookingPickupPointTime:Time,
        bookingDropPointLocation:string, bookingDropPointTime:Time, bookingTime:Time) {

            this.bookingId=bookingId;
            this.busId=busId;
            this.userId=userId;
            this.bpuId=bpuId;
            this.bookingsource=bookingsource;
            this.bookingDestination=bookingDestination;
            this.bookingFare=bookingFare;
            this.bookingPickupPointLocation=bookingPickupPointLocation;
            this.bookingPickupPointTime=bookingPickupPointTime;
            this.bookingDropPointLocation=bookingDropPointLocation;
            this.bookingDropPointTime=bookingDropPointTime;
            this.bookingTime=bookingTime;
        
    }

}