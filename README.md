# Quarkus - Pretty Time
<!-- ALL-CONTRIBUTORS-BADGE:START - Do not remove or modify this section -->
[![All Contributors](https://img.shields.io/badge/all_contributors-2-orange.svg?style=flat-square)](#contributors-)
<!-- ALL-CONTRIBUTORS-BADGE:END -->
_Social Style Date and Time Formatting for Java_

[![Version](https://img.shields.io/maven-central/v/io.quarkiverse.prettytime/?logo=apache-maven&style=for-the-badge)](https://search.maven.org/artifact/io.quarkiverse.prettytime/quarkus-prettytime-nlp)

PrettyTime is an OpenSource time formatting library. Completely customizable, it creates human readable, relative timestamps. 
This extension allows you to use this library in Quarkus native applications.

You can find more about it at https://www.ocpsoft.org/prettytime/.

To get started, add the dependency:

```xml
<dependency>
    <groupId>io.quarkiverse.prettytime</groupId>
    <artifactId>quarkus-prettytime-nlp</artifactId>
    <version>LATEST</version>
</dependency>
```

## Features

### Inject PrettyTime Singleton

A singleton `org.ocpsoft.prettytime.PrettyTime` can be injected anywhere. 

```java
// Inject PrettyTime using the default locale
@Inject PrettyTime prettyTime;
```

**Important**: Be aware that any changes to the injected `PrettyTime` object (as in calling `setLocale` or `setReference`) will reflect on the singleton and its usage in your entire application. In cases where you need to format to a specific locale we recommend you to create a new `PrettyTime` object instead.

The singleton may be referenced by the name `prettyTime` when used in a non-typesafe environment such as templates. For example, if used together with the [Qute](https://quarkus.io/guides/qute-reference) templating engine:

```html
<table>
  {#for label in labels}
  <tr>
    <td>{label.name}</td>
    <td>Created {inject:prettyTime.format(label.created)}</td>
  </tr>
  {/for}
</table>
```

### Native Support

This extension is fully supported in native mode.

## Contributors ✨

Thanks goes to these wonderful people ([emoji key](https://allcontributors.org/docs/en/emoji-key)):

<!-- ALL-CONTRIBUTORS-LIST:START - Do not remove or modify this section -->
<!-- prettier-ignore-start -->
<!-- markdownlint-disable -->
<table>
  <tr>
    <td align="center"><a href="https://github.com/joes"><img src="https://avatars.githubusercontent.com/u/32820?s=100&v=4" width="100px;" alt=""/><br /><sub><b>Joe Siponen</b></sub></a><br /><a href="https://github.com/quarkiverse/quarkus-prettytime-nlp/commits?author=joes" title="Code">💻</a></td>
  </tr>
</table>

<!-- markdownlint-restore -->
<!-- prettier-ignore-end -->

<!-- ALL-CONTRIBUTORS-LIST:END -->

This project follows the [all-contributors](https://github.com/all-contributors/all-contributors) specification. Contributions of any kind welcome!
