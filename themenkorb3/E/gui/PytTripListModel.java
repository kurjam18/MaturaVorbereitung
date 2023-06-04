/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue_08.gui;

import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import ue_08.data.PytTrip;

/**
 *
 * @author ruffe
 */
public class PytTripListModel extends AbstractListModel<PytTrip>
{
  private final List<PytTrip> pytTrips;

  public PytTripListModel(List<PytTrip> pytTrips)
  {
    this.pytTrips = pytTrips;
  }
 
  @Override
  public int getSize()
  {
    return pytTrips.size();
  }

  @Override
  public PytTrip getElementAt(int index)
  {
    return pytTrips.get(index);
  }
  
}
