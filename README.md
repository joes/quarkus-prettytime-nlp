# Quarkus - Pretty Time
<!-- ALL-CONTRIBUTORS-BADGE:START - Do not remove or modify this section -->
[![All Contributors](https://img.shields.io/badge/all_contributors-2-orange.svg?style=flat-square)](#contributors-)
<!-- ALL-CONTRIBUTORS-BADGE:END -->
_Natural language java.util.Date and human time parsing library for Java._

[![Version](https://img.shields.io/maven-central/v/io.quarkiverse.prettytime/?logo=apache-maven&style=for-the-badge)](https://search.maven.org/artifact/io.quarkiverse.prettytime/quarkus-prettytime-nlp)

PrettyTime :: NLP is an OpenSource, Java Library – enabling simple parsing and computer understanding of natural language, and social date references like, “let’s go to dinner at 6,” or “I’ll be on vacation for three days”.

This extension allows you to use this library in Quarkus native applications.

You can find more about it at https://www.ocpsoft.org/prettytime/nlp/.

To get started, add the dependency:

```xml
<dependency>
    <groupId>io.quarkiverse.prettytime</groupId>
    <artifactId>quarkus-prettytime-nlp</artifactId>
    <version>{quarkus-prettytime-nlp-version}</version>
</dependency>
```

## Features

### Inject `PrettyTimeParser` Singleton

A singleton `org.ocpsoft.prettytime.PrettyTimeParser` can be injected anywhere. 

```java
// Inject PrettyTimeParser
@Inject PrettyTimeParser prettyTimeParser;
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
