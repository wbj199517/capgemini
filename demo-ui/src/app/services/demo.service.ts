import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';


@Injectable()



export class DemoService {

  constructor(private http: HttpClient) { }
  messages="Create by Bojun";

  getDecode(stringInput:String){
    this.http.get<any>('server/api/hash/decode/'+ stringInput).subscribe(res =>{
     this.messages = res.content;
     console.log(this.messages);
   })
 }

  getEncode(stringInput:String){
     this.http.get<any>('server/api/hash/encode/'+ stringInput).subscribe(res =>{
      this.messages = res.content;
      console.log(this.messages);
    })
  }

}
