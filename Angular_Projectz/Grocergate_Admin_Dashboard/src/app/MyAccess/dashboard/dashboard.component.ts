import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Router } from '@angular/router'; // Import the Router


@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent {
  title = 'Grocergate_Admin_Dashboard';
  status = false;
  addToggle()
  {
    this.status = !this.status;       
  }
  
  constructor(private router:Router){}
  //get request from web api
  logout() {
    // Clear user session (for example, remove user token from local storage)
    localStorage.removeItem('userToken');

    // Navigate to the login page
    this.router.navigate(['']);

}
   

}

