import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';
import { Geolocation } from '@ionic-native/geolocation';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {
  lat: any;
  lng: any;
  constructor(public navCtrl: NavController, public ggg: Geolocation) {

  }

  ionViewDidLoad()
  {
    this.ggg.getCurrentPosition().then( pos => {
        this.lat = pos.coords.latitude;
       // this.lat = 15;
       this.lng = pos.coords.longitude;
    }).catch( err => console.log(err));
  }

}
