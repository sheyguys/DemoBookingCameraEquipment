import { Component, OnInit } from '@angular/core';
import { AppserviceService } from '../bookingequipment-service/appservice.service'
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  credentials = {username: '', password: ''};
  constructor(private app: AppserviceService, private http: HttpClient, private router: Router) {
  }


  ngOnInit() {
    // console.log(this.app.authenticated)
  }
  LoginSubmit(){
       this.app.authenticate(this.credentials,()=>{
         if(this.app.authenticated){
          this.router.navigate(['']);
         }else{
          //  alert('not user')

         }
        //  console.log(this.app.authenticated)
        // this.router.navigate(['']);
       })

  }
}
