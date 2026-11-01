#!/bin/bash


./command/javadoc/javadoc.sh
./command/package/javadoc_jar.sh

echo -e "README Html pages for JaisocxCombiner were produced.\n"

echo -e "readme/javadoc/index.html\n"

echo -e "Browser link: file://$(realpath .)/readme/javadoc/index.html\n\n"


