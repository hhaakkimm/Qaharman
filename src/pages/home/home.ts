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

  timeout() {
      var that = this;
      setTimeout(function () {
          console.log('Test');
          that.timeout();
      }, 3000);
  };

  constructor(public navCtrl: NavController, public ggg: Geolocation) {

  }

  ionViewDidLoad()
  {
    this.ggg.getCurrentPosition().then( pos => {
        this.lat = pos.coords.latitude;
       // this.lat = 15;
       this.lng = pos.coords.longitude;
       this.timeout();
    }).catch( err => console.log(err));
  }

}
