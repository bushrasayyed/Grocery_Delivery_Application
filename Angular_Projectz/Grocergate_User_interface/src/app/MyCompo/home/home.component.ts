import { Component } from '@angular/core';
import { Router } from '@angular/router'; // Import the Router


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {
  constructor(private router: Router) {} // Inject the Router

  logout() {
    // Clear user session (for example, remove user token from local storage)
    localStorage.removeItem('userToken');

    // Navigate to the login page
    this.router.navigate(['/login']);

}
}