
import { NgModule, Component} from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MainComponent } from '../main/main.component';
import { HistoryComponent } from '../history/history.component';
import { LoginComponent } from '../login/login.component';
const routes: Routes = [
{ path: '', component: MainComponent },
{ path:'history',component:HistoryComponent},
{ path:'login',component:LoginComponent},
];
@NgModule({
  exports: [ RouterModule ],
  imports: [ RouterModule.forRoot(routes) ]
})
export class RoutingMainComponent  {

}
