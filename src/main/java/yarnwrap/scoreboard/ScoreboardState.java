package yarnwrap.scoreboard;
public class ScoreboardState { public net.minecraft.scoreboard.ScoreboardState wrapperContained; public ScoreboardState(net.minecraft.scoreboard.ScoreboardState wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.scoreboard.Scoreboard scoreboard() { return new yarnwrap.scoreboard.Scoreboard(wrapperContained.scoreboard); }
// public void scoreboard(yarnwrap.scoreboard.Scoreboard value) { wrapperContained.scoreboard = value.wrapperContained; }
// public static yarnwrap.scoreboard.Scoreboard scoreboard() { return new yarnwrap.scoreboard.Scoreboard(net.minecraft.scoreboard.ScoreboardState.scoreboard); }
// public static void scoreboard(yarnwrap.scoreboard.Scoreboard value, ) { net.minecraft.scoreboard.ScoreboardState.scoreboard = value.wrapperContained; }

// public java.lang.String SCOREBOARD_KEY() { return wrapperContained.SCOREBOARD_KEY; }
// public void SCOREBOARD_KEY(java.lang.String value) { wrapperContained.SCOREBOARD_KEY = value; }
public static java.lang.String SCOREBOARD_KEY() { return net.minecraft.scoreboard.ScoreboardState.SCOREBOARD_KEY; }
// public static void SCOREBOARD_KEY(java.lang.String value, ) { net.minecraft.scoreboard.ScoreboardState.SCOREBOARD_KEY = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.scoreboard.ScoreboardState.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.scoreboard.ScoreboardState.LOGGER = value; }

public ScoreboardState(yarnwrap.scoreboard.Scoreboard scoreboard) { this.wrapperContained = new net.minecraft.scoreboard.ScoreboardState(scoreboard.wrapperContained); }
// public void readTeamPlayersNbt(yarnwrap.scoreboard.Team team,yarnwrap.nbt.NbtList nbt) { wrapperContained.readTeamPlayersNbt(team.wrapperContained,nbt.wrapperContained); }
// public static void readTeamPlayersNbt(yarnwrap.scoreboard.Team team,yarnwrap.nbt.NbtList nbt, ) { net.minecraft.scoreboard.ScoreboardState.readTeamPlayersNbt(team.wrapperContained,nbt.wrapperContained); }
// public yarnwrap.nbt.NbtList objectivesToNbt(Object registries) { return new yarnwrap.nbt.NbtList(wrapperContained.objectivesToNbt(registries)); }
// public static yarnwrap.nbt.NbtList objectivesToNbt(Object registries, ) { return new yarnwrap.nbt.NbtList(net.minecraft.scoreboard.ScoreboardState.objectivesToNbt(registries)); }
// public yarnwrap.nbt.NbtList teamsToNbt(Object registries) { return new yarnwrap.nbt.NbtList(wrapperContained.teamsToNbt(registries)); }
// public static yarnwrap.nbt.NbtList teamsToNbt(Object registries, ) { return new yarnwrap.nbt.NbtList(net.minecraft.scoreboard.ScoreboardState.teamsToNbt(registries)); }
// public void readTeamsNbt(yarnwrap.nbt.NbtList nbt,Object registries) { wrapperContained.readTeamsNbt(nbt.wrapperContained,registries); }
// public static void readTeamsNbt(yarnwrap.nbt.NbtList nbt,Object registries, ) { net.minecraft.scoreboard.ScoreboardState.readTeamsNbt(nbt.wrapperContained,registries); }
// public void readObjectivesNbt(yarnwrap.nbt.NbtList nbt,Object registries) { wrapperContained.readObjectivesNbt(nbt.wrapperContained,registries); }
// public static void readObjectivesNbt(yarnwrap.nbt.NbtList nbt,Object registries, ) { net.minecraft.scoreboard.ScoreboardState.readObjectivesNbt(nbt.wrapperContained,registries); }
// public void readDisplaySlotsNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.readDisplaySlotsNbt(nbt.wrapperContained); }
// public static void readDisplaySlotsNbt(yarnwrap.nbt.NbtCompound nbt, ) { net.minecraft.scoreboard.ScoreboardState.readDisplaySlotsNbt(nbt.wrapperContained); }
// public void writeDisplaySlotsNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.writeDisplaySlotsNbt(nbt.wrapperContained); }
// public static void writeDisplaySlotsNbt(yarnwrap.nbt.NbtCompound nbt, ) { net.minecraft.scoreboard.ScoreboardState.writeDisplaySlotsNbt(nbt.wrapperContained); }
// public yarnwrap.scoreboard.ScoreboardState readNbt(yarnwrap.nbt.NbtCompound nbt,Object registries) { return new yarnwrap.scoreboard.ScoreboardState(wrapperContained.readNbt(nbt.wrapperContained,registries)); }
// public static yarnwrap.scoreboard.ScoreboardState readNbt(yarnwrap.nbt.NbtCompound nbt,Object registries, ) { return new yarnwrap.scoreboard.ScoreboardState(net.minecraft.scoreboard.ScoreboardState.readNbt(nbt.wrapperContained,registries)); }

}