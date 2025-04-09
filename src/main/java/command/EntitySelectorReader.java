package yarnwrap.command;
public class EntitySelectorReader { public net.minecraft.command.EntitySelectorReader wrapperContained; public EntitySelectorReader(net.minecraft.command.EntitySelectorReader wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.brigadier.exceptions.SimpleCommandExceptionType UNTERMINATED_EXCEPTION() { return wrapperContained.UNTERMINATED_EXCEPTION; }
// public Object distance() { return wrapperContained.distance; }
// public java.lang.Double z() { return wrapperContained.z; }
// public boolean usesAt() { return wrapperContained.usesAt; }
// public boolean selectsScores() { return wrapperContained.selectsScores; }
// public Object levelRange() { return wrapperContained.levelRange; }
// public boolean includesNonPlayers() { return wrapperContained.includesNonPlayers; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType MISSING_EXCEPTION() { return wrapperContained.MISSING_EXCEPTION; }
// public boolean selectsTeam() { return wrapperContained.selectsTeam; }
// public boolean atAllowed() { return wrapperContained.atAllowed; }
// public java.util.function.BiConsumer sorter() { return wrapperContained.sorter; }
// public java.util.function.BiFunction suggestionProvider() { return wrapperContained.suggestionProvider; }
// public boolean selectsGameMode() { return wrapperContained.selectsGameMode; }
public java.util.function.BiConsumer RANDOM() { return wrapperContained.RANDOM; }
// public boolean hasLimit() { return wrapperContained.hasLimit; }
// public java.lang.Double dy() { return wrapperContained.dy; }
public com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_SELECTOR_EXCEPTION() { return wrapperContained.UNKNOWN_SELECTOR_EXCEPTION; }
// public boolean selectsName() { return wrapperContained.selectsName; }
public com.mojang.brigadier.exceptions.DynamicCommandExceptionType VALUELESS_EXCEPTION() { return wrapperContained.VALUELESS_EXCEPTION; }
// public java.lang.Double x() { return wrapperContained.x; }
// public int limit() { return wrapperContained.limit; }
// public yarnwrap.command.FloatRangeArgument yawRange() { return new yarnwrap.command.FloatRangeArgument(wrapperContained.yawRange); }
// public com.mojang.brigadier.StringReader reader() { return wrapperContained.reader; }
// public int startCursor() { return wrapperContained.startCursor; }
// public java.lang.Double dx() { return wrapperContained.dx; }
// public yarnwrap.entity.EntityType entityType() { return new yarnwrap.entity.EntityType(wrapperContained.entityType); }
// public boolean selectsAdvancements() { return wrapperContained.selectsAdvancements; }
// public boolean excludesEntityType() { return wrapperContained.excludesEntityType; }
// public boolean localWorldOnly() { return wrapperContained.localWorldOnly; }
public java.util.function.BiFunction DEFAULT_SUGGESTION_PROVIDER() { return wrapperContained.DEFAULT_SUGGESTION_PROVIDER; }
// public boolean excludesTeam() { return wrapperContained.excludesTeam; }
public java.util.function.BiConsumer NEAREST() { return wrapperContained.NEAREST; }
// public java.util.List predicates() { return wrapperContained.predicates; }
// public boolean excludesGameMode() { return wrapperContained.excludesGameMode; }
// public java.lang.Double y() { return wrapperContained.y; }
// public boolean hasSorter() { return wrapperContained.hasSorter; }
// public boolean excludesName() { return wrapperContained.excludesName; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType INVALID_ENTITY_EXCEPTION() { return wrapperContained.INVALID_ENTITY_EXCEPTION; }
// public java.lang.String playerName() { return wrapperContained.playerName; }
// public yarnwrap.command.FloatRangeArgument pitchRange() { return new yarnwrap.command.FloatRangeArgument(wrapperContained.pitchRange); }
// public java.util.UUID uuid() { return wrapperContained.uuid; }
// public boolean senderOnly() { return wrapperContained.senderOnly; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType NOT_ALLOWED_EXCEPTION() { return wrapperContained.NOT_ALLOWED_EXCEPTION; }
// public java.lang.Double dz() { return wrapperContained.dz; }
public java.util.function.BiConsumer FURTHEST() { return wrapperContained.FURTHEST; }
public char SELECTOR_PREFIX() { return wrapperContained.SELECTOR_PREFIX; }
public char ARGUMENT_DEFINER() { return wrapperContained.ARGUMENT_DEFINER; }
public char INVERT_MODIFIER() { return wrapperContained.INVERT_MODIFIER; }
public char TAG_MODIFIER() { return wrapperContained.TAG_MODIFIER; }
// public char ARGUMENTS_OPENING() { return wrapperContained.ARGUMENTS_OPENING; }
// public char ARGUMENTS_CLOSING() { return wrapperContained.ARGUMENTS_CLOSING; }
// public char ARGUMENT_SEPARATOR() { return wrapperContained.ARGUMENT_SEPARATOR; }
// public char NEAREST_PLAYER() { return wrapperContained.NEAREST_PLAYER; }
// public char ALL_PLAYERS() { return wrapperContained.ALL_PLAYERS; }
// public char RANDOM_PLAYER() { return wrapperContained.RANDOM_PLAYER; }
// public char SELF() { return wrapperContained.SELF; }
// public char ALL_ENTITIES() { return wrapperContained.ALL_ENTITIES; }
// public char NEAREST_ENTITY() { return wrapperContained.NEAREST_ENTITY; }
// public boolean excludesTeam() { return wrapperContained.excludesTeam(); }
// public java.util.concurrent.CompletableFuture suggestDefinerNext(com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.util.function.Consumer consumer) { return wrapperContained.suggestDefinerNext(builder,consumer); }
public java.util.function.BiConsumer getSorter() { return wrapperContained.getSorter(); }
public boolean shouldAllowAtSelectors(java.lang.Object source) { return wrapperContained.shouldAllowAtSelectors(source); }
public void setExcludesTeam(boolean excludesTeam) { wrapperContained.setExcludesTeam(excludesTeam); }
// public java.util.concurrent.CompletableFuture suggestSelectorRest(com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.util.function.Consumer consumer) { return wrapperContained.suggestSelectorRest(builder,consumer); }
public com.mojang.brigadier.StringReader getReader() { return wrapperContained.getReader(); }
// public boolean excludesGameMode() { return wrapperContained.excludesGameMode(); }
// public boolean selectsGameMode() { return wrapperContained.selectsGameMode(); }
public java.lang.Double getDy() { return wrapperContained.getDy(); }
public void setIncludesNonPlayers(boolean includesNonPlayers) { wrapperContained.setIncludesNonPlayers(includesNonPlayers); }
public void setEntityType(yarnwrap.entity.EntityType entityType) { wrapperContained.setEntityType(entityType.wrapperContained); }
// public boolean selectsScores() { return wrapperContained.selectsScores(); }
// public boolean excludesName() { return wrapperContained.excludesName(); }
public void setSorter(java.util.function.BiConsumer sorter) { wrapperContained.setSorter(sorter); }
// public void setLevelRange(Object levelRange) { wrapperContained.setLevelRange(levelRange); }
// public java.util.concurrent.CompletableFuture suggestEndNext(com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.util.function.Consumer consumer) { return wrapperContained.suggestEndNext(builder,consumer); }
public void setSelectsScores(boolean selectsScores) { wrapperContained.setSelectsScores(selectsScores); }
// public void readRegular() { wrapperContained.readRegular(); }
public void setX(double x) { wrapperContained.setX(x); }
public java.lang.Double getDx() { return wrapperContained.getDx(); }
public void setLocalWorldOnly() { wrapperContained.setLocalWorldOnly(); }
public yarnwrap.command.FloatRangeArgument getYawRange() { return new yarnwrap.command.FloatRangeArgument(wrapperContained.getYawRange()); }
public void setYawRange(yarnwrap.command.FloatRangeArgument yawRange) { wrapperContained.setYawRange(yawRange.wrapperContained); }
public void setExcludesGameMode(boolean excludesGameMode) { wrapperContained.setExcludesGameMode(excludesGameMode); }
// public java.util.concurrent.CompletableFuture suggestNormal(com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.util.function.Consumer consumer) { return wrapperContained.suggestNormal(builder,consumer); }
// public java.util.function.Predicate rotationPredicate(yarnwrap.command.FloatRangeArgument angleRange,java.util.function.ToDoubleFunction entityToAngle) { return wrapperContained.rotationPredicate(angleRange.wrapperContained,entityToAngle); }
public void setExcludesEntityType() { wrapperContained.setExcludesEntityType(); }
// public boolean selectsAdvancements() { return wrapperContained.selectsAdvancements(); }
public void setY(double y) { wrapperContained.setY(y); }
public void setSelectsTeam(boolean selectsTeam) { wrapperContained.setSelectsTeam(selectsTeam); }
// public boolean hasLimit() { return wrapperContained.hasLimit(); }
public java.lang.Double getZ() { return wrapperContained.getZ(); }
// public void setDistance(Object distance) { wrapperContained.setDistance(distance); }
public yarnwrap.command.EntitySelector build() { return new yarnwrap.command.EntitySelector(wrapperContained.build()); }
public Object getDistance() { return wrapperContained.getDistance(); }
// public void readArguments() { wrapperContained.readArguments(); }
public void setSuggestionProvider(java.util.function.BiFunction suggestionProvider) { wrapperContained.setSuggestionProvider(suggestionProvider); }
public void setHasLimit(boolean hasLimit) { wrapperContained.setHasLimit(hasLimit); }
// public void buildPredicate() { wrapperContained.buildPredicate(); }
public void setZ(double z) { wrapperContained.setZ(z); }
// public java.util.concurrent.CompletableFuture suggestSelector(com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.util.function.Consumer consumer) { return wrapperContained.suggestSelector(builder,consumer); }
// public yarnwrap.command.EntitySelector read() { return new yarnwrap.command.EntitySelector(wrapperContained.read()); }
public yarnwrap.command.FloatRangeArgument getPitchRange() { return new yarnwrap.command.FloatRangeArgument(wrapperContained.getPitchRange()); }
public java.lang.Double getY() { return wrapperContained.getY(); }
public boolean isSenderOnly() { return wrapperContained.isSenderOnly(); }
public boolean selectsEntityType() { return wrapperContained.selectsEntityType(); }
public void setHasSorter(boolean hasSorter) { wrapperContained.setHasSorter(hasSorter); }
// public boolean hasSorter() { return wrapperContained.hasSorter(); }
public void setSelectsGameMode(boolean selectsGameMode) { wrapperContained.setSelectsGameMode(selectsGameMode); }
public void setDx(double dx) { wrapperContained.setDx(dx); }
public boolean readNegationCharacter() { return wrapperContained.readNegationCharacter(); }
// public java.util.concurrent.CompletableFuture suggestOpen(com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.util.function.Consumer consumer) { return wrapperContained.suggestOpen(builder,consumer); }
// public yarnwrap.util.math.Box createBox(double x,double y,double z) { return new yarnwrap.util.math.Box(wrapperContained.createBox(x,y,z)); }
public Object getLevelRange() { return wrapperContained.getLevelRange(); }
// public void suggestSelector(com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { wrapperContained.suggestSelector(builder); }
public void setPitchRange(yarnwrap.command.FloatRangeArgument pitchRange) { wrapperContained.setPitchRange(pitchRange.wrapperContained); }
public void setSelectsName(boolean selectsName) { wrapperContained.setSelectsName(selectsName); }
public void setLimit(int limit) { wrapperContained.setLimit(limit); }
public java.lang.Double getX() { return wrapperContained.getX(); }
// public boolean selectsTeam() { return wrapperContained.selectsTeam(); }
public void setDy(double dy) { wrapperContained.setDy(dy); }
public void setSelectsAdvancements(boolean selectsAdvancements) { wrapperContained.setSelectsAdvancements(selectsAdvancements); }
public java.lang.Double getDz() { return wrapperContained.getDz(); }
public java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.util.function.Consumer consumer) { return wrapperContained.listSuggestions(builder,consumer); }
// public java.util.concurrent.CompletableFuture suggestOption(com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.util.function.Consumer consumer) { return wrapperContained.suggestOption(builder,consumer); }
// public boolean excludesEntityType() { return wrapperContained.excludesEntityType(); }
// public java.util.concurrent.CompletableFuture suggestOptionOrEnd(com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.util.function.Consumer consumer) { return wrapperContained.suggestOptionOrEnd(builder,consumer); }
// public boolean selectsName() { return wrapperContained.selectsName(); }
public void setExcludesName(boolean excludesName) { wrapperContained.setExcludesName(excludesName); }
public boolean readTagCharacter() { return wrapperContained.readTagCharacter(); }
public void addPredicate(java.util.function.Predicate predicate) { wrapperContained.addPredicate(predicate); }
// public void readAtVariable() { wrapperContained.readAtVariable(); }
public void setDz(double dz) { wrapperContained.setDz(dz); }

}