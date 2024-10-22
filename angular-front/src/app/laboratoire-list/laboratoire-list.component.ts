import { Component, OnInit } from '@angular/core';
import { Laboratoire } from '../laboratoire';
import { CommonModule } from '@angular/common';
import { ServiceLaboratoireService } from '../service-laboratoire.service';

@Component({
  selector: 'app-laboratoire-list',
  standalone: true,
  templateUrl: './laboratoire-list.component.html',
  styleUrls: ['./laboratoire-list.component.css'],
  imports: [CommonModule] // Conservez uniquement CommonModule ici
})
export class LaboratoireListComponent implements OnInit {
  laboratoires: Laboratoire[] = [];

  constructor(private laboratoireService: ServiceLaboratoireService) {}

  ngOnInit(): void {
    this.getLaboratoires();
  }

  private getLaboratoires() {
    this.laboratoireService.getLaboratoiresList().subscribe({
      next: (data) => {
        this.laboratoires = data;
      },
      error: (error) => {
        console.error('Erreur lors de la récupération des laboratoires :', error);
      }
    });
  }
}
