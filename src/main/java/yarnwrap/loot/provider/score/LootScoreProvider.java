package yarnwrap.loot.provider.score;
public class LootScoreProvider { public net.minecraft.loot.provider.score.LootScoreProvider wrapperContained; public LootScoreProvider(net.minecraft.loot.provider.score.LootScoreProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.loot.provider.score.LootScoreProviderType getType() { return new yarnwrap.loot.provider.score.LootScoreProviderType(wrapperContained.getType()); }
public java.util.Set getRequiredParameters() { return wrapperContained.getRequiredParameters(); }
public yarnwrap.scoreboard.ScoreHolder getScoreHolder(yarnwrap.loot.context.LootContext context) { return new yarnwrap.scoreboard.ScoreHolder(wrapperContained.getScoreHolder(context.wrapperContained)); }

}