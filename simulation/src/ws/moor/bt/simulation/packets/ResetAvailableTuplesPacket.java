/*
 * BitThief - A Free Riding BitTorrent Client
 * Copyright (C) 2006 Patrick Moor <patrick@moor.ws>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301,
 * USA.
 */

package ws.moor.bt.simulation.packets;

/**
 * Created by IntelliJ IDEA.
 * User: pmoor
 * Date: Sep 1, 2006
 * Time: 6:52:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class ResetAvailableTuplesPacket implements Packet {

  private static final int PACKET_SIZE = 32;

  public void accept(PacketVisitor visitor) {
    visitor.visitResetAvailableTuplesPacket(this);
  }

  public int getSizeOnWire() {
    return PACKET_SIZE;
  }
}