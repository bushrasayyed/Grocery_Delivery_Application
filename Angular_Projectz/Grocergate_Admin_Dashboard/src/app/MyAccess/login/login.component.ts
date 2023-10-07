import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms'; // Import NgForm

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {


  email: string ="";
  password: string ="";
  constructor(private router: Router,private http: HttpClient) {}
 
  Login(loginForm: any) {
    if (loginForm.valid) {
    console.log(this.email);
    console.log(this.password);
 
    let bodyData = {
      email: this.email,
      password: this.password,
    };
 
        this.http.post("http://localhost:2222/admin/login", bodyData).subscribe(  (resultData: any) => {
        console.log(resultData);
 
        if (resultData.message == "Email does not exits")
        {
      
          alert("Email does not exists");
    
 
        }
        else if(resultData.message == "Login Success")
    
         {
          localStorage.setItem('isLoggedIn', 'true');
          this.router.navigateByUrl('/dashboard');
        }
        else
        {
          alert("Incorrect Email and Password not match");
        }
      });
    }
    else {
      alert('Please check your inputs.');
    }
}
}

