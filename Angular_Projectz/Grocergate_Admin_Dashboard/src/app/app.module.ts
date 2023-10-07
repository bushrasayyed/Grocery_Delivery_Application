import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './MyAccess/login/login.component';
import { DashboardComponent } from './MyAccess/dashboard/dashboard.component';
import { ReactiveFormsModule } from '@angular/forms';
import { FormsModule } from '@angular/forms';
import { UsersComponent } from './MyAccess/users/users.component';
import { ProductsComponent } from './MyAccess/products/products.component';
import { OrdersComponent } from './MyAccess/orders/orders.component';
import { CategoriesComponent } from './MyAccess/categories/categories.component';
import { PaymentsComponent } from './MyAccess/payments/payments.component';
import { NotificatonsComponent } from './MyAccess/notificatons/notificatons.component';
import { InventoryComponent } from './MyAccess/inventory/inventory.component';
import { AuthGuard } from './auth.guard';
import { ProfileComponent } from './MyAccess/profile/profile.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    DashboardComponent,
    UsersComponent,
    ProductsComponent,
    OrdersComponent,
    CategoriesComponent,
    PaymentsComponent,
    NotificatonsComponent,
    InventoryComponent,
    ProfileComponent,
    
  ],
  imports: [
    HttpClientModule,
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [AuthGuard],
  bootstrap: [AppComponent]
})
export class AppModule { }
