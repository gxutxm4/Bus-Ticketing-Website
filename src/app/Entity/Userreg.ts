export class Userreg{
    userId:number;
	userfName:string;	
	userlName:string;
	username:string;
	userPassword:string;
	userEmail:string;
	userContactNo:string;
	userDOB:Date;

    constructor(userId:number, userfName:string, userlName:string, username:string, userPassword:string, 
        userEmail:string, userContactNo:string, userDOB:Date){

        this.userId=userId;
        this.userfName=userfName;	
        this.userlName=userlName;
        this.username=username;
        this.userPassword=userPassword;
        this.userEmail=userEmail;
        this.userContactNo=userContactNo;
        this.userDOB=userDOB;
    }

}