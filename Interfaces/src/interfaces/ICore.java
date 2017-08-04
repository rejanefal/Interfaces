/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author flavi
 */
public abstract interface ICore
{
  public abstract boolean initialize();
  
  public abstract IUIController getUIController();
  
  public abstract IGameController getGameController();
  
  public abstract IPluginController getPluginController();
}
