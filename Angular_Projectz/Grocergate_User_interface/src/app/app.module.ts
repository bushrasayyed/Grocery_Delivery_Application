import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './MyCompo/login/login.component';
import { RegisterComponent } from './MyCompo/register/register.component';
import { HomeComponent } from './MyCompo/home/home.component';
import { HeaderComponent } from './MyCompo/header/header.component';
import { ReactiveFormsModule } from '@angular/forms';
import { TncComponent } from './MyCompo/tnc/tnc.component';
import { AboutComponent } from './MyCompo/about/about.component';



@NgModule({
  declarations: [
    
    AppComponent,
    LoginComponent,
    RegisterComponent,
    HomeComponent,
    HeaderComponent,
    AboutComponent,
    TncComponent,
   
   
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    AppRoutingModule,
    ReactiveFormsModule
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
