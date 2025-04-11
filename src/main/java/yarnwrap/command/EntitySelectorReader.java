package yarnwrap.command;
public class EntitySelectorReader { public net.minecraft.command.EntitySelectorReader wrapperContained; public EntitySelectorReader(net.minecraft.command.EntitySelectorReader wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.brigadier.exceptions.SimpleCommandExceptionType UNTERMINATED_EXCEPTION() { return wrapperContained.UNTERMINATED_EXCEPTION; }
// public void UNTERMINATED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.UNTERMINATED_EXCEPTION = value; }
// public Object distance() { return wrapperContained.distance; }
// // public void distance(Object value) { wrapperContained.distance = value; }
// public java.lang.Double z() { return wrapperContained.z; }
// public void z(java.lang.Double value) { wrapperContained.z = value; }
// public boolean usesAt() { return wrapperContained.usesAt; }
// public void usesAt(boolean value) { wrapperContained.usesAt = value; }
// public boolean selectsScores() { return wrapperContained.selectsScores; }
// public void selectsScores(boolean value) { wrapperContained.selectsScores = value; }
// public Object levelRange() { return wrapperContained.levelRange; }
// // public void levelRange(Object value) { wrapperContained.levelRange = value; }
// public boolean includesNonPlayers() { return wrapperContained.includesNonPlayers; }
// public void includesNonPlayers(boolean value) { wrapperContained.includesNonPlayers = value; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType MISSING_EXCEPTION() { return wrapperContained.MISSING_EXCEPTION; }
// public void MISSING_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.MISSING_EXCEPTION = value; }
// public boolean selectsTeam() { return wrapperContained.selectsTeam; }
// public void selectsTeam(boolean value) { wrapperContained.selectsTeam = value; }
// public boolean atAllowed() { return wrapperContained.atAllowed; }
// public void atAllowed(boolean value) { wrapperContained.atAllowed = value; }
// public java.util.function.BiConsumer sorter() { return wrapperContained.sorter; }
// public void sorter(java.util.function.BiConsumer value) { wrapperContained.sorter = value; }
// public java.util.function.BiFunction suggestionProvider() { return wrapperContained.suggestionProvider; }
// public void suggestionProvider(java.util.function.BiFunction value) { wrapperContained.suggestionProvider = value; }
// public boolean selectsGameMode() { return wrapperContained.selectsGameMode; }
// public void selectsGameMode(boolean value) { wrapperContained.selectsGameMode = value; }
public java.util.function.BiConsumer RANDOM() { return wrapperContained.RANDOM; }
// public void RANDOM(java.util.function.BiConsumer value) { wrapperContained.RANDOM = value; }
// public boolean hasLimit() { return wrapperContained.hasLimit; }
// public void hasLimit(boolean value) { wrapperContained.hasLimit = value; }
// public java.lang.Double dy() { return wrapperContained.dy; }
// public void dy(java.lang.Double value) { wrapperContained.dy = value; }
public com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_SELECTOR_EXCEPTION() { return wrapperContained.UNKNOWN_SELECTOR_EXCEPTION; }
// public void UNKNOWN_SELECTOR_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.UNKNOWN_SELECTOR_EXCEPTION = value; }
// public boolean selectsName() { return wrapperContained.selectsName; }
// public void selectsName(boolean value) { wrapperContained.selectsName = value; }
public com.mojang.brigadier.exceptions.DynamicCommandExceptionType VALUELESS_EXCEPTION() { return wrapperContained.VALUELESS_EXCEPTION; }
// public void VALUELESS_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.VALUELESS_EXCEPTION = value; }
// public java.lang.Double x() { return wrapperContained.x; }
// public void x(java.lang.Double value) { wrapperContained.x = value; }
// public int limit() { return wrapperContained.limit; }
// public void limit(int value) { wrapperContained.limit = value; }
// public yarnwrap.command.FloatRangeArgument yawRange() { return new yarnwrap.command.FloatRangeArgument(wrapperContained.yawRange); }
// public void yawRange(yarnwrap.command.FloatRangeArgument value) { wrapperContained.yawRange = value.wrapperContained; }
// public com.mojang.brigadier.StringReader reader() { return wrapperContained.reader; }
// public void reader(com.mojang.brigadier.StringReader value) { wrapperContained.reader = value; }
// public int startCursor() { return wrapperContained.startCursor; }
// public void startCursor(int value) { wrapperContained.startCursor = value; }
// public java.lang.Double dx() { return wrapperContained.dx; }
// public void dx(java.lang.Double value) { wrapperContained.dx = value; }
// public yarnwrap.entity.EntityType entityType() { return new yarnwrap.entity.EntityType(wrapperContained.entityType); }
// public void entityType(yarnwrap.entity.EntityType value) { wrapperContained.entityType = value.wrapperContained; }
// public boolean selectsAdvancements() { return wrapperContained.selectsAdvancements; }
// public void selectsAdvancements(boolean value) { wrapperContained.selectsAdvancements = value; }
// public boolean excludesEntityType() { return wrapperContained.excludesEntityType; }
// public void excludesEntityType(boolean value) { wrapperContained.excludesEntityType = value; }
// public boolean localWorldOnly() { return wrapperContained.localWorldOnly; }
// public void localWorldOnly(boolean value) { wrapperContained.localWorldOnly = value; }
public java.util.function.BiFunction DEFAULT_SUGGESTION_PROVIDER() { return wrapperContained.DEFAULT_SUGGESTION_PROVIDER; }
// public void DEFAULT_SUGGESTION_PROVIDER(java.util.function.BiFunction value) { wrapperContained.DEFAULT_SUGGESTION_PROVIDER = value; }
// public boolean excludesTeam() { return wrapperContained.excludesTeam; }
// public void excludesTeam(boolean value) { wrapperContained.excludesTeam = value; }
public java.util.function.BiConsumer NEAREST() { return wrapperContained.NEAREST; }
// public void NEAREST(java.util.function.BiConsumer value) { wrapperContained.NEAREST = value; }
// public java.util.List predicates() { return wrapperContained.predicates; }
// public void predicates(java.util.List value) { wrapperContained.predicates = value; }
// public boolean excludesGameMode() { return wrapperContained.excludesGameMode; }
// public void excludesGameMode(boolean value) { wrapperContained.excludesGameMode = value; }
// public java.lang.Double y() { return wrapperContained.y; }
// public void y(java.lang.Double value) { wrapperContained.y = value; }
// public boolean hasSorter() { return wrapperContained.hasSorter; }
// public void hasSorter(boolean value) { wrapperContained.hasSorter = value; }
// public boolean excludesName() { return wrapperContained.excludesName; }
// public void excludesName(boolean value) { wrapperContained.excludesName = value; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType INVALID_ENTITY_EXCEPTION() { return wrapperContained.INVALID_ENTITY_EXCEPTION; }
// public void INVALID_ENTITY_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.INVALID_ENTITY_EXCEPTION = value; }
// public java.lang.String playerName() { return wrapperContained.playerName; }
// public void playerName(java.lang.String value) { wrapperContained.playerName = value; }
// public yarnwrap.command.FloatRangeArgument pitchRange() { return new yarnwrap.command.FloatRangeArgument(wrapperContained.pitchRange); }
// public void pitchRange(yarnwrap.command.FloatRangeArgument value) { wrapperContained.pitchRange = value.wrapperContained; }
// public java.util.UUID uuid() { return wrapperContained.uuid; }
// public void uuid(java.util.UUID value) { wrapperContained.uuid = value; }
// public boolean senderOnly() { return wrapperContained.senderOnly; }
// public void senderOnly(boolean value) { wrapperContained.senderOnly = value; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType NOT_ALLOWED_EXCEPTION() { return wrapperContained.NOT_ALLOWED_EXCEPTION; }
// public void NOT_ALLOWED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.NOT_ALLOWED_EXCEPTION = value; }
// public java.lang.Double dz() { return wrapperContained.dz; }
// public void dz(java.lang.Double value) { wrapperContained.dz = value; }
public java.util.function.BiConsumer FURTHEST() { return wrapperContained.FURTHEST; }
// public void FURTHEST(java.util.function.BiConsumer value) { wrapperContained.FURTHEST = value; }
public char SELECTOR_PREFIX() { return wrapperContained.SELECTOR_PREFIX; }
// public void SELECTOR_PREFIX(char value) { wrapperContained.SELECTOR_PREFIX = value; }
public char ARGUMENT_DEFINER() { return wrapperContained.ARGUMENT_DEFINER; }
// public void ARGUMENT_DEFINER(char value) { wrapperContained.ARGUMENT_DEFINER = value; }
public char INVERT_MODIFIER() { return wrapperContained.INVERT_MODIFIER; }
// public void INVERT_MODIFIER(char value) { wrapperContained.INVERT_MODIFIER = value; }
public char TAG_MODIFIER() { return wrapperContained.TAG_MODIFIER; }
// public void TAG_MODIFIER(char value) { wrapperContained.TAG_MODIFIER = value; }
// public char ARGUMENTS_OPENING() { return wrapperContained.ARGUMENTS_OPENING; }
// public void ARGUMENTS_OPENING(char value) { wrapperContained.ARGUMENTS_OPENING = value; }
// public char ARGUMENTS_CLOSING() { return wrapperContained.ARGUMENTS_CLOSING; }
// public void ARGUMENTS_CLOSING(char value) { wrapperContained.ARGUMENTS_CLOSING = value; }
// public char ARGUMENT_SEPARATOR() { return wrapperContained.ARGUMENT_SEPARATOR; }
// public void ARGUMENT_SEPARATOR(char value) { wrapperContained.ARGUMENT_SEPARATOR = value; }
// public char NEAREST_PLAYER() { return wrapperContained.NEAREST_PLAYER; }
// public void NEAREST_PLAYER(char value) { wrapperContained.NEAREST_PLAYER = value; }
// public char ALL_PLAYERS() { return wrapperContained.ALL_PLAYERS; }
// public void ALL_PLAYERS(char value) { wrapperContained.ALL_PLAYERS = value; }
// public char RANDOM_PLAYER() { return wrapperContained.RANDOM_PLAYER; }
// public void RANDOM_PLAYER(char value) { wrapperContained.RANDOM_PLAYER = value; }
// public char SELF() { return wrapperContained.SELF; }
// public void SELF(char value) { wrapperContained.SELF = value; }
// public char ALL_ENTITIES() { return wrapperContained.ALL_ENTITIES; }
// public void ALL_ENTITIES(char value) { wrapperContained.ALL_ENTITIES = value; }
// public char NEAREST_ENTITY() { return wrapperContained.NEAREST_ENTITY; }
// public void NEAREST_ENTITY(char value) { wrapperContained.NEAREST_ENTITY = value; }
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