//
//  ViewController.swift
//  Calculator_aari
//
//  Created by Nikunj Vaidya on 6/22/19.
//  Copyright © 2019 Nikunj Vaidya. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    var numberOnScreen:Double = 0;
    var previousNumber:Double = 0;
    var performingMath = false;
    var operation = 0;
    
    
    
    @IBAction func numbers(_ sender: UIButton) {
        
        if performingMath == true {
            label.text = String(sender.tag-1);
            numberOnScreen = Double(label.text!)!
            performingMath = false;
        
        } else {
            label.text = label.text! + String(sender.tag-1);
            numberOnScreen = Double(label.text!)!
        }
    
    }
    
    
    @IBOutlet weak var label: UILabel!
    
    
    
    @IBAction func buttons(_ sender: UIButton) {
        
        if label.text != "" && sender.tag != 11 && sender.tag != 16 {
            
            previousNumber = Double(label.text!)!
            
            if sender.tag == 12 {
                label.text = "/";
            } else if sender.tag == 13 {
                label.text = "x";
            }else if sender.tag == 14 {
                label.text = "+";
            }else if sender.tag == 15 {
                label.text = "-";
            }
            
            operation = sender.tag
            performingMath = true;
            
            
        } else if sender.tag == 16 {
            if operation == 12{
                label.text = String(previousNumber/numberOnScreen)
            } else if operation == 13{
                label.text = String(previousNumber*numberOnScreen)
            } else if operation == 14{
                label.text = String(previousNumber+numberOnScreen)
            } else if operation == 15{
                label.text = String(previousNumber-numberOnScreen)
            }
        } else if sender.tag == 11 {
            label.text = "";
            previousNumber = 0;
            numberOnScreen = 0;
            operation = 0;
        }

        
        
        
        
}

    
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
       
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        
    }


}

