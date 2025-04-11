package yarnwrap.network.packet;
public class PlayPackets { public net.minecraft.network.packet.PlayPackets wrapperContained; public PlayPackets(net.minecraft.network.packet.PlayPackets wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.packet.PacketType MOVE_VEHICLE_S2C() { return new yarnwrap.network.packet.PacketType(wrapperContained.MOVE_VEHICLE_S2C); }
// public void MOVE_VEHICLE_S2C(yarnwrap.network.packet.PacketType value) { wrapperContained.MOVE_VEHICLE_S2C = value.wrapperContained; }
public yarnwrap.network.packet.PacketType PLAYER_ABILITIES_S2C() { return new yarnwrap.network.packet.PacketType(wrapperContained.PLAYER_ABILITIES_S2C); }
// public void PLAYER_ABILITIES_S2C(yarnwrap.network.packet.PacketType value) { wrapperContained.PLAYER_ABILITIES_S2C = value.wrapperContained; }
public yarnwrap.network.packet.PacketType SET_CARRIED_ITEM_S2C() { return new yarnwrap.network.packet.PacketType(wrapperContained.SET_CARRIED_ITEM_S2C); }
// public void SET_CARRIED_ITEM_S2C(yarnwrap.network.packet.PacketType value) { wrapperContained.SET_CARRIED_ITEM_S2C = value.wrapperContained; }
public yarnwrap.network.packet.PacketType MOVE_VEHICLE_C2S() { return new yarnwrap.network.packet.PacketType(wrapperContained.MOVE_VEHICLE_C2S); }
// public void MOVE_VEHICLE_C2S(yarnwrap.network.packet.PacketType value) { wrapperContained.MOVE_VEHICLE_C2S = value.wrapperContained; }
public yarnwrap.network.packet.PacketType PLAYER_ABILITIES_C2S() { return new yarnwrap.network.packet.PacketType(wrapperContained.PLAYER_ABILITIES_C2S); }
// public void PLAYER_ABILITIES_C2S(yarnwrap.network.packet.PacketType value) { wrapperContained.PLAYER_ABILITIES_C2S = value.wrapperContained; }
public yarnwrap.network.packet.PacketType SET_CARRIED_ITEM_C2S() { return new yarnwrap.network.packet.PacketType(wrapperContained.SET_CARRIED_ITEM_C2S); }
// public void SET_CARRIED_ITEM_C2S(yarnwrap.network.packet.PacketType value) { wrapperContained.SET_CARRIED_ITEM_C2S = value.wrapperContained; }
public yarnwrap.network.packet.PacketType CHANGE_DIFFICULTY_C2S() { return new yarnwrap.network.packet.PacketType(wrapperContained.CHANGE_DIFFICULTY_C2S); }
// public void CHANGE_DIFFICULTY_C2S(yarnwrap.network.packet.PacketType value) { wrapperContained.CHANGE_DIFFICULTY_C2S = value.wrapperContained; }
public yarnwrap.network.packet.PacketType CONTAINER_CLOSE_C2S() { return new yarnwrap.network.packet.PacketType(wrapperContained.CONTAINER_CLOSE_C2S); }
// public void CONTAINER_CLOSE_C2S(yarnwrap.network.packet.PacketType value) { wrapperContained.CONTAINER_CLOSE_C2S = value.wrapperContained; }
public yarnwrap.network.packet.PacketType CHANGE_DIFFICULTY_S2C() { return new yarnwrap.network.packet.PacketType(wrapperContained.CHANGE_DIFFICULTY_S2C); }
// public void CHANGE_DIFFICULTY_S2C(yarnwrap.network.packet.PacketType value) { wrapperContained.CHANGE_DIFFICULTY_S2C = value.wrapperContained; }
public yarnwrap.network.packet.PacketType CONTAINER_CLOSE_S2C() { return new yarnwrap.network.packet.PacketType(wrapperContained.CONTAINER_CLOSE_S2C); }
// public void CONTAINER_CLOSE_S2C(yarnwrap.network.packet.PacketType value) { wrapperContained.CONTAINER_CLOSE_S2C = value.wrapperContained; }
// public yarnwrap.network.packet.PacketType s2c(java.lang.String id) { return new yarnwrap.network.packet.PacketType(wrapperContained.s2c(id)); }
// public yarnwrap.network.packet.PacketType c2s(java.lang.String id) { return new yarnwrap.network.packet.PacketType(wrapperContained.c2s(id)); }

}