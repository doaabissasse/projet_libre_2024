import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";
import { LaboratoireListComponent } from "./laboratoire-list/laboratoire-list.component";
import { AjouterLaboratoireComponent } from "./ajouter-laboratoire/ajouter-laboratoire.component";

const routes: Routes =[
    {path: 'laboratoires', component: LaboratoireListComponent},
    {path: 'ajouter-laboratoire', component: AjouterLaboratoireComponent},
    {path: '', redirectTo: 'laboratoires', pathMatch: 'full'}
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule {}