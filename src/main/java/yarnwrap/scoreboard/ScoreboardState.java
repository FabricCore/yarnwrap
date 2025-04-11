package yarnwrap.scoreboard;
public class ScoreboardState { public net.minecraft.scoreboard.ScoreboardState wrapperContained; public ScoreboardState(net.minecraft.scoreboard.ScoreboardState wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.scoreboard.Scoreboard scoreboard() { return new yarnwrap.scoreboard.Scoreboard(wrapperContained.scoreboard); }
// public void scoreboard(yarnwrap.scoreboard.Scoreboard value) { wrapperContained.scoreboard = value.wrapperContained; }
public java.lang.String SCOREBOARD_KEY() { return wrapperContained.SCOREBOARD_KEY; }
// public void SCOREBOARD_KEY(java.lang.String value) { wrapperContained.SCOREBOARD_KEY = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public void readTeamPlayersNbt(yarnwrap.scoreboard.Team team,yarnwrap.nbt.NbtList nbt) { wrapperContained.readTeamPlayersNbt(team.wrapperContained,nbt.wrapperContained); }
// public yarnwrap.nbt.NbtList objectivesToNbt(Object registries) { return new yarnwrap.nbt.NbtList(wrapperContained.objectivesToNbt(registries)); }
// public yarnwrap.nbt.NbtList teamsToNbt(Object registries) { return new yarnwrap.nbt.NbtList(wrapperContained.teamsToNbt(registries)); }
// public void readTeamsNbt(yarnwrap.nbt.NbtList nbt,Object registries) { wrapperContained.readTeamsNbt(nbt.wrapperContained,registries); }
// public void readObjectivesNbt(yarnwrap.nbt.NbtList nbt,Object registries) { wrapperContained.readObjectivesNbt(nbt.wrapperContained,registries); }
// public void readDisplaySlotsNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.readDisplaySlotsNbt(nbt.wrapperContained); }
// public void writeDisplaySlotsNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.writeDisplaySlotsNbt(nbt.wrapperContained); }
// public yarnwrap.scoreboard.ScoreboardState readNbt(yarnwrap.nbt.NbtCompound nbt,Object registries) { return new yarnwrap.scoreboard.ScoreboardState(wrapperContained.readNbt(nbt.wrapperContained,registries)); }

}