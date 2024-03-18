export class BPUser {

    bpuId:number;	
	bpufName:string;
	bpulName:string;
    bpuCompanyName:string;	
	bpuUsername:string;	
	bpuPassword:string;	
	bpuEmail:string;	
	bpuContactno:number;	
	bpuDOB:Date;

    constructor(bpuId:number, bpufName:string, bpulName:string, bpuCompanyName:string, bpuUsername:string,	bpuPassword:string, 
        bpuEmail:string, bpuContactno:number, bpuDOB:Date) {
        
            this.bpuId=bpuId;	
            this.bpufName=bpufName;
            this.bpulName=bpulName;
            this.bpuCompanyName=bpuCompanyName;
            this.bpuUsername=bpuUsername;	
            this.bpuPassword=bpuPassword;	
            this.bpuEmail=bpuEmail;	
            this.bpuContactno=bpuContactno;	
            this.bpuDOB=bpuDOB;

    }
}