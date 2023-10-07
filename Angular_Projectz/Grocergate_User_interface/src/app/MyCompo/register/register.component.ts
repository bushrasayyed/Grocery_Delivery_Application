import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { NgForm } from '@angular/forms'; // Import NgForm


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent {
  username: string ="";
  email: string ="";
  password: string ="";
  
  constructor(private http: HttpClient )
  {
  }
  save(signupForm: NgForm) {
    if (signupForm.valid) {
  
    let bodyData = {
      "username" : this.username,
      "email" : this.email,
      "password" : this.password
    };
    this.http.post("http://localhost:2222/user/save",bodyData,{responseType: 'text'}).subscribe((resultData: any)=>
    {
        console.log(resultData);
        alert("Signed-Up successfully");
    });
  }
  else {
    alert('Data is invalid. Please check your inputs.');
  }
}
}

