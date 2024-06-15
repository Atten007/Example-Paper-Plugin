package de.rexlmanu.paperpluginstarter.config;

import de.exlll.configlib.Configuration;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@SuppressWarnings("FieldMayBeFinal")
@Configuration
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PluginConfig {
  String test = "test";
}
