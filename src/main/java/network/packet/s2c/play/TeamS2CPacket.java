package yarnwrap.network.packet.s2c.play;
public class TeamS2CPacket { public net.minecraft.network.packet.s2c.play.TeamS2CPacket wrapperContained; public TeamS2CPacket(net.minecraft.network.packet.s2c.play.TeamS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int packetType() { return wrapperContained.packetType; }
// public java.lang.String teamName() { return wrapperContained.teamName; }
// public java.util.Collection playerNames() { return wrapperContained.playerNames; }
// public java.util.Optional team() { return wrapperContained.team; }
// public int ADD() { return wrapperContained.ADD; }
// public int REMOVE() { return wrapperContained.REMOVE; }
// public int UPDATE() { return wrapperContained.UPDATE; }
// public int ADD_PLAYERS() { return wrapperContained.ADD_PLAYERS; }
// public int REMOVE_PLAYERS() { return wrapperContained.REMOVE_PLAYERS; }
// public int FIRST_MAX_VISIBILITY_OR_COLLISION_RULE_LENGTH() { return wrapperContained.FIRST_MAX_VISIBILITY_OR_COLLISION_RULE_LENGTH; }
// public int SECOND_MAX_VISIBILITY_OR_COLLISION_RULE_LENGTH() { return wrapperContained.SECOND_MAX_VISIBILITY_OR_COLLISION_RULE_LENGTH; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public boolean containsPlayers(int packetType) { return wrapperContained.containsPlayers(packetType); }
public yarnwrap.network.packet.s2c.play.TeamS2CPacket updateRemovedTeam(yarnwrap.scoreboard.Team team) { return new yarnwrap.network.packet.s2c.play.TeamS2CPacket(wrapperContained.updateRemovedTeam(team.wrapperContained)); }
// public yarnwrap.network.packet.s2c.play.TeamS2CPacket changePlayerTeam(yarnwrap.scoreboard.Team team,java.lang.String playerName,Object operation) { return new yarnwrap.network.packet.s2c.play.TeamS2CPacket(wrapperContained.changePlayerTeam(team.wrapperContained,playerName,operation)); }
public yarnwrap.network.packet.s2c.play.TeamS2CPacket updateTeam(yarnwrap.scoreboard.Team team,boolean updatePlayers) { return new yarnwrap.network.packet.s2c.play.TeamS2CPacket(wrapperContained.updateTeam(team.wrapperContained,updatePlayers)); }
public Object getPlayerListOperation() { return wrapperContained.getPlayerListOperation(); }
// public boolean containsTeamInfo(int packetType) { return wrapperContained.containsTeamInfo(packetType); }
public Object getTeamOperation() { return wrapperContained.getTeamOperation(); }
public java.lang.String getTeamName() { return wrapperContained.getTeamName(); }
public java.util.Collection getPlayerNames() { return wrapperContained.getPlayerNames(); }
public java.util.Optional getTeam() { return wrapperContained.getTeam(); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}