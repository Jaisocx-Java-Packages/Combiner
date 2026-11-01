#!/bin/bash

javadoc \
  -private \
  -doctitle "Jaisocx Combiner Tool" \
  -linksource \
  --syntax-highlight \
  -html5 \
  --no-platform-links \
  -charset utf8 \
  -d "./readme/javadoc/" \
  --source-path "./src/main/java/" \
    com.jaisocx.tools.combiner.i \
    com.jaisocx.tools.combiner

#   --add-stylesheet "./readme/javadoc/bundle_css/clean_start_tiny__theme_base.css" \
#   --add-stylesheet "./readme/javadoc/bundle_css/clean_start_tiny__html_tags_n_styles.css" \
#   --add-stylesheet "./readme/javadoc/bundle_css/clean_start_tiny__sites_tools.css" \
#   --add-stylesheet "./readme/javadoc/bundle_css/clean_start_tiny__fonts.css" \




