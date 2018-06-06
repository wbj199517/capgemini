import { Component,OnInit } from '@angular/core';
import { DemoService } from './services/demo.service'

@Component({
  selector: 'encode',
  template: `
    <div>
        <h1>Base64 App</h1>
        <input [(ngModel)]="encodeInput" placeholder="Encode your text here!">
        <button (click)="getEncodeResult()">Encode</button>
        <button (click)="getDecodeResult()">Decode</button>

        <h3>Result Generated ==> {{demoService.messages}}</h3>
    </div>
  `,
})

export class EncodeComponent {
    public encodeInput:String;
    public EncodeResult:String;

  constructor(private demoService: DemoService){
  }
    getDecodeResult(){
     this.demoService.getDecode(this.encodeInput);
     console.log('Decoding.....');
 }

    getEncodeResult(){
     this.demoService.getEncode(this.encodeInput);
     console.log('Encoding.....');
 }
}
