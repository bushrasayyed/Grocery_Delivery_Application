import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './MyAccess/login/login.component';
import { DashboardComponent } from './MyAccess/dashboard/dashboard.component';
import { UsersComponent } from './MyAccess/users/users.component';
import { ProductsComponent } from './MyAccess/products/products.component';
import { CategoriesComponent } from './MyAccess/categories/categories.component';
import { PaymentsComponent } from './MyAccess/payments/payments.component';
import { NotificatonsComponent } from './MyAccess/notificatons/notificatons.component';
import { InventoryComponent } from './MyAccess/inventory/inventory.component';
import { OrdersComponent } from './MyAccess/orders/orders.component';
import { AuthGuard } from './auth.guard';
import { ProfileComponent } from './MyAccess/profile/profile.component';

const routes: Routes = [
  {

    path: '',
    component: LoginComponent
  },
  {

    path: 'dashboard/profile',
    component: ProfileComponent
  },
  
{

  path: 'dashboard',
  canActivate: [AuthGuard],
  component: DashboardComponent
},
{

  path: 'dashboard/users',
  component: UsersComponent
},
{

  path: 'dashboard/products',
  component: ProductsComponent
},
{

  path: 'dashboard/categories',
  component: CategoriesComponent
},
{

  path: 'dashboard/payments',
  component: PaymentsComponent
},
{

  path: 'dashboard/orders',
  component: OrdersComponent
},

{

  path: 'dashboard/notifications',
  component: NotificatonsComponent
},
{

  path: 'dashboard/inventory',
  component: InventoryComponent
},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
