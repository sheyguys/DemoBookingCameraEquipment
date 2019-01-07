import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { MatNativeDateModule, MatButtonModule, MatCardModule, MatInputModule, MatListModule, MatToolbarModule } from '@angular/material';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FormsModule } from '@angular/forms';
import { RouterModule, Routes } from '@angular/router';
import { MainComponent } from './main/main.component';
import { MatCheckboxModule } from '@angular/material/checkbox';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatSelectModule } from '@angular/material/select';
import { MatDatepickerModule } from '@angular/material/datepicker';
import { MatTabsModule } from '@angular/material/tabs';
import { MatTableModule } from '@angular/material/table';
import { HistoryComponent } from './history/history.component';
import { RoutingMainComponent } from './routing-main/routing-main.component';
import { BookingequipmentService } from './bookingequipment-service/bookingequipment.service';
import { LoginComponent } from './login/login.component';


const appRoutes: Routes = [{ path: 'history', component: HistoryComponent}

];

@NgModule({
  declarations: [
    AppComponent,
    MainComponent,
    HistoryComponent,
    LoginComponent,
  ],
  imports: [
    RoutingMainComponent,
    BrowserModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatCardModule,
    MatInputModule,
    MatListModule,
    MatToolbarModule,
    FormsModule,
    MatCheckboxModule,
    MatFormFieldModule,
    MatSelectModule,
    MatDatepickerModule,
    MatNativeDateModule,
    MatTabsModule,
    MatTableModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [BookingequipmentService],
  bootstrap: [AppComponent]
})
export class AppModule { }
