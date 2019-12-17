package com.hubspot.slack.client.models.interaction;

import java.util.Optional;

import org.immutables.value.Value.Immutable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hubspot.immutables.style.HubSpotStyle;
import com.hubspot.slack.client.models.blocks.elements.BlockElement;
import com.hubspot.slack.client.models.interaction.json.BlockElementActionDeserializer;
import com.hubspot.slack.client.models.interaction.json.BlockElementActionSerializer;

@Immutable
@HubSpotStyle
@JsonNaming(SnakeCaseStrategy.class)
@JsonDeserialize(using = BlockElementActionDeserializer.class)
@JsonSerialize(using = BlockElementActionSerializer.class)
public interface BlockElementActionIF {
  String getBlockId();

  BlockElement getElement();

  @JsonProperty("value")
  Optional<String> getSelectedValue();

  Optional<String> getActionTs();
}