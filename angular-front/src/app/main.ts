import { bootstrapApplication } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { appConfig } from './app.config';
import { app } from '../../server';

bootstrapApplication(AppComponent, appConfig)
     .catch(err => console.error(err));
