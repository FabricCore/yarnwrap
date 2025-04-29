package yarnwrap.network.packet.s2c.play;
public class TeamS2CPacket { public net.minecraft.network.packet.s2c.play.TeamS2CPacket wrapperContained; public TeamS2CPacket(net.minecraft.network.packet.s2c.play.TeamS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int packetType() { return wrapperContained.packetType; }
// public void packetType(int value) { wrapperContained.packetType = value; }
// public static int packetType() { return net.minecraft.network.packet.s2c.play.TeamS2CPacket.packetType; }
// public static void packetType(int value, ) { net.minecraft.network.packet.s2c.play.TeamS2CPacket.packetType = value; }

// public java.lang.String teamName() { return wrapperContained.teamName; }
// public void teamName(java.lang.String value) { wrapperContained.teamName = value; }
// public static java.lang.String teamName() { return net.minecraft.network.packet.s2c.play.TeamS2CPacket.teamName; }
// public static void teamName(java.lang.String value, ) { net.minecraft.network.packet.s2c.play.TeamS2CPacket.teamName = value; }

// public java.util.Collection playerNames() { return wrapperContained.playerNames; }
// public void playerNames(java.util.Collection value) { wrapperContained.playerNames = value; }
// public static java.util.Collection playerNames() { return net.minecraft.network.packet.s2c.play.TeamS2CPacket.playerNames; }
// public static void playerNames(java.util.Collection value, ) { net.minecraft.network.packet.s2c.play.TeamS2CPacket.playerNames = value; }

// public java.util.Optional team() { return wrapperContained.team; }
// public void team(java.util.Optional value) { wrapperContained.team = value; }
// public static java.util.Optional team() { return net.minecraft.network.packet.s2c.play.TeamS2CPacket.team; }
// public static void team(java.util.Optional value, ) { net.minecraft.network.packet.s2c.play.TeamS2CPacket.team = value; }

// public int ADD() { return wrapperContained.ADD; }
// public void ADD(int value) { wrapperContained.ADD = value; }
// public static int ADD() { return net.minecraft.network.packet.s2c.play.TeamS2CPacket.ADD; }
// public static void ADD(int value, ) { net.minecraft.network.packet.s2c.play.TeamS2CPacket.ADD = value; }

// public int REMOVE() { return wrapperContained.REMOVE; }
// public void REMOVE(int value) { wrapperContained.REMOVE = value; }
// public static int REMOVE() { return net.minecraft.network.packet.s2c.play.TeamS2CPacket.REMOVE; }
// public static void REMOVE(int value, ) { net.minecraft.network.packet.s2c.play.TeamS2CPacket.REMOVE = value; }

// public int UPDATE() { return wrapperContained.UPDATE; }
// public void UPDATE(int value) { wrapperContained.UPDATE = value; }
// public static int UPDATE() { return net.minecraft.network.packet.s2c.play.TeamS2CPacket.UPDATE; }
// public static void UPDATE(int value, ) { net.minecraft.network.packet.s2c.play.TeamS2CPacket.UPDATE = value; }

// public int ADD_PLAYERS() { return wrapperContained.ADD_PLAYERS; }
// public void ADD_PLAYERS(int value) { wrapperContained.ADD_PLAYERS = value; }
// public static int ADD_PLAYERS() { return net.minecraft.network.packet.s2c.play.TeamS2CPacket.ADD_PLAYERS; }
// public static void ADD_PLAYERS(int value, ) { net.minecraft.network.packet.s2c.play.TeamS2CPacket.ADD_PLAYERS = value; }

// public int REMOVE_PLAYERS() { return wrapperContained.REMOVE_PLAYERS; }
// public void REMOVE_PLAYERS(int value) { wrapperContained.REMOVE_PLAYERS = value; }
// public static int REMOVE_PLAYERS() { return net.minecraft.network.packet.s2c.play.TeamS2CPacket.REMOVE_PLAYERS; }
// public static void REMOVE_PLAYERS(int value, ) { net.minecraft.network.packet.s2c.play.TeamS2CPacket.REMOVE_PLAYERS = value; }

// public int FIRST_MAX_VISIBILITY_OR_COLLISION_RULE_LENGTH() { return wrapperContained.FIRST_MAX_VISIBILITY_OR_COLLISION_RULE_LENGTH; }
// public void FIRST_MAX_VISIBILITY_OR_COLLISION_RULE_LENGTH(int value) { wrapperContained.FIRST_MAX_VISIBILITY_OR_COLLISION_RULE_LENGTH = value; }
// public static int FIRST_MAX_VISIBILITY_OR_COLLISION_RULE_LENGTH() { return net.minecraft.network.packet.s2c.play.TeamS2CPacket.FIRST_MAX_VISIBILITY_OR_COLLISION_RULE_LENGTH; }
// public static void FIRST_MAX_VISIBILITY_OR_COLLISION_RULE_LENGTH(int value, ) { net.minecraft.network.packet.s2c.play.TeamS2CPacket.FIRST_MAX_VISIBILITY_OR_COLLISION_RULE_LENGTH = value; }

// public int SECOND_MAX_VISIBILITY_OR_COLLISION_RULE_LENGTH() { return wrapperContained.SECOND_MAX_VISIBILITY_OR_COLLISION_RULE_LENGTH; }
// public void SECOND_MAX_VISIBILITY_OR_COLLISION_RULE_LENGTH(int value) { wrapperContained.SECOND_MAX_VISIBILITY_OR_COLLISION_RULE_LENGTH = value; }
// public static int SECOND_MAX_VISIBILITY_OR_COLLISION_RULE_LENGTH() { return net.minecraft.network.packet.s2c.play.TeamS2CPacket.SECOND_MAX_VISIBILITY_OR_COLLISION_RULE_LENGTH; }
// public static void SECOND_MAX_VISIBILITY_OR_COLLISION_RULE_LENGTH(int value, ) { net.minecraft.network.packet.s2c.play.TeamS2CPacket.SECOND_MAX_VISIBILITY_OR_COLLISION_RULE_LENGTH = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.TeamS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.TeamS2CPacket.CODEC = value.wrapperContained; }

// public TeamS2CPacket(java.lang.String teamName,int packetType,java.util.Optional team,java.util.Collection playerNames) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.TeamS2CPacket(teamName,packetType,team,playerNames); }
// public TeamS2CPacket(yarnwrap.network.RegistryByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.TeamS2CPacket(buf.wrapperContained); }
// public boolean containsPlayers(int packetType) { return wrapperContained.containsPlayers(packetType); }
// public static boolean containsPlayers(int packetType, ) { return net.minecraft.network.packet.s2c.play.TeamS2CPacket.containsPlayers(packetType); }
// public yarnwrap.network.packet.s2c.play.TeamS2CPacket updateRemovedTeam(yarnwrap.scoreboard.Team team) { return new yarnwrap.network.packet.s2c.play.TeamS2CPacket(wrapperContained.updateRemovedTeam(team.wrapperContained)); }
// public static yarnwrap.network.packet.s2c.play.TeamS2CPacket updateRemovedTeam(yarnwrap.scoreboard.Team team, ) { return new yarnwrap.network.packet.s2c.play.TeamS2CPacket(net.minecraft.network.packet.s2c.play.TeamS2CPacket.updateRemovedTeam(team.wrapperContained)); }
// public yarnwrap.network.packet.s2c.play.TeamS2CPacket changePlayerTeam(yarnwrap.scoreboard.Team team,java.lang.String playerName,Object operation) { return new yarnwrap.network.packet.s2c.play.TeamS2CPacket(wrapperContained.changePlayerTeam(team.wrapperContained,playerName,operation)); }
// public static yarnwrap.network.packet.s2c.play.TeamS2CPacket changePlayerTeam(yarnwrap.scoreboard.Team team,java.lang.String playerName,Object operation, ) { return new yarnwrap.network.packet.s2c.play.TeamS2CPacket(net.minecraft.network.packet.s2c.play.TeamS2CPacket.changePlayerTeam(team.wrapperContained,playerName,operation)); }
// public yarnwrap.network.packet.s2c.play.TeamS2CPacket updateTeam(yarnwrap.scoreboard.Team team,boolean updatePlayers) { return new yarnwrap.network.packet.s2c.play.TeamS2CPacket(wrapperContained.updateTeam(team.wrapperContained,updatePlayers)); }
// public static yarnwrap.network.packet.s2c.play.TeamS2CPacket updateTeam(yarnwrap.scoreboard.Team team,boolean updatePlayers, ) { return new yarnwrap.network.packet.s2c.play.TeamS2CPacket(net.minecraft.network.packet.s2c.play.TeamS2CPacket.updateTeam(team.wrapperContained,updatePlayers)); }
public Object getPlayerListOperation() { return wrapperContained.getPlayerListOperation(); }
// public static Object getPlayerListOperation() { return net.minecraft.network.packet.s2c.play.TeamS2CPacket.getPlayerListOperation(); }
// public boolean containsTeamInfo(int packetType) { return wrapperContained.containsTeamInfo(packetType); }
// public static boolean containsTeamInfo(int packetType, ) { return net.minecraft.network.packet.s2c.play.TeamS2CPacket.containsTeamInfo(packetType); }
public Object getTeamOperation() { return wrapperContained.getTeamOperation(); }
// public static Object getTeamOperation() { return net.minecraft.network.packet.s2c.play.TeamS2CPacket.getTeamOperation(); }
public java.lang.String getTeamName() { return wrapperContained.getTeamName(); }
// public static java.lang.String getTeamName() { return net.minecraft.network.packet.s2c.play.TeamS2CPacket.getTeamName(); }
public java.util.Collection getPlayerNames() { return wrapperContained.getPlayerNames(); }
// public static java.util.Collection getPlayerNames() { return net.minecraft.network.packet.s2c.play.TeamS2CPacket.getPlayerNames(); }
public java.util.Optional getTeam() { return wrapperContained.getTeam(); }
// public static java.util.Optional getTeam() { return net.minecraft.network.packet.s2c.play.TeamS2CPacket.getTeam(); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.RegistryByteBuf buf, ) { net.minecraft.network.packet.s2c.play.TeamS2CPacket.write(buf.wrapperContained); }

}