export class Laboratoire {
  nom: string;
  logo: string;
  nrc: string;
  active: boolean; // Cela correspond au type boolean dans le backend
  dateActivation: string; // Utilisez string pour le format de date

  constructor() {
    this.nom = '';
    this.logo = '';
    this.nrc = '';
    this.active = false; // Valeur par défaut
    this.dateActivation = new Date().toISOString().split('T')[0]; // Format ISO (YYYY-MM-DD)
  }
}
