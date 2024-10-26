import { Component } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { LaboratoireListComponent } from './laboratoire-list/laboratoire-list.component';
import { AjouterLaboratoireComponent } from "./ajouter-laboratoire/ajouter-laboratoire.component";
import { RouterModule } from '@angular/router';

@Component({
  standalone: true,
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  imports: [LaboratoireListComponent,
    HttpClientModule,RouterModule,AjouterLaboratoireComponent
  ]
})
export class AppComponent {
  title = 'angular-front';
}
