FROM azul/zulu-openjdk:17

RUN mkdir /app
RUN adduser javauser
RUN adduser javauser javauser

ENV JAVA_OPS "-Xms256m -Xmx1024m"
ARG profile=dev
ENV SPRING_PROFILE_ACTIVE $profile

EXPOSE 8080
EXPOSE 8081

COPY target/*.jar /app/app.jar
COPY entrypoint.sh /app/entrypoint.sh

RUN chown -R javauser:javauser /app
USER javauser

WORKDIR /app

ENTRYPOINT ["sh","entrypoint.sh"]