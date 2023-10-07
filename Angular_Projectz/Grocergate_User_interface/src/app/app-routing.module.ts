import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './MyCompo/login/login.component';
import { RegisterComponent } from './MyCompo/register/register.component';
import { HomeComponent } from './MyCompo/home/home.component';
import { HeaderComponent } from './MyCompo/header/header.component';
import { AboutComponent } from './MyCompo/about/about.component';
import { TncComponent } from './MyCompo/tnc/tnc.component';



const routes: Routes = [
  {

    path: '',
    component: HeaderComponent
  },
  {

    path: 'about',
    component: AboutComponent
  },
  {

    path: 'tnc',
    component: TncComponent
  },
  
  
{

  path: 'login',
  component: LoginComponent
},
{

  path: 'home',
  component: HomeComponent
},


{
path: 'register',
component: RegisterComponent,
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
