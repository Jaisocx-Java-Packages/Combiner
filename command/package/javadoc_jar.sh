#!/bin/bash

package_name="jaisocx_combiner"
javadoc_jar_name="${package_name}_javadoc.jar"

mkdir "readme/javadoc/META-INF"
cp -a "./src/main/resources/manifest/MANIFEST.MF" "./readme/javadoc/META-INF/MANIFEST.MF"


jar --create -f "./app/build/${javadoc_jar_name}" -C "./readme/javadoc" "./"


rm -r "./readme/javadoc/META-INF"




