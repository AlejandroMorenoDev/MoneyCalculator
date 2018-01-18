/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moneycalculator.persistence;

import moneycalculator.model.Currency;
import moneycalculator.model.ExchangeRate;

/**
 *
 * @author amct2
 */
public interface ExchangeRateLoader {
    
    ExchangeRate load(Currency from, Currency to);
    
    
}
