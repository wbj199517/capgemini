import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { DemoService } from './services/demo.service';
import { EncodeComponent } from './encode.component';
import {Routes,RouterModule} from '@angular/router';
import { HttpModule } from '@angular/http';

const routes:Routes=[
  {path:'encode',component:EncodeComponent}
]
@NgModule({
  declarations: [
    AppComponent,
    EncodeComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    HttpModule,
    RouterModule.forRoot(routes)
  ],

  exports:[RouterModule],
  providers: [DemoService],
  bootstrap: [AppComponent]
})
export class AppModule { }
