import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { importProvidersFrom } from '@angular/core';
import { LaboratoireListComponent } from './laboratoire-list/laboratoire-list.component';
import { AppComponent } from './app.component';
import { AjouterLaboratoireComponent } from './ajouter-laboratoire/ajouter-laboratoire.component';
import { FormsModule } from '@angular/forms';


@NgModule({
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    LaboratoireListComponent,
    AjouterLaboratoireComponent ,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {}
