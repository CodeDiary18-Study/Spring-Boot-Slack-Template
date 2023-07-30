# Spring Boot Slack Template
Spring Boot에 Slack 관련 기능을 구현한 템플릿 프로젝트  
<br><br>

## Development Environment
- OS : Windows
- IDE : IntelliJ IDEA Ultimate
- Language : Java 17(zulu)
- Framework : Spring Boot
- Build Tool : Gradle

<br><br>

## API Introduction
- 메시지 전송
    - **URL** : ```/slack/send```
    - **Method** : POST
    - **Request**
        - **Content-Type** : application/json
        - **Body**
          | Name | Type | Mandatory | Example | Description |
          | :---: | :---: | :---: | :----: | :------------: |
          | title | String | Y | 슬랙봇 메시지 타이틀 | 제목 |
          | message | Object | Y | {"내용 1": "내용 1 데이터", "내용 2": "내용 2 데이터"} | 내용 |

            - example
              ```json
              {
                  "title" : "[제목] 슬랙봇 메시지 타이틀",
                  "message":{
                      "내용 1": "내용 1 데이터",
                      "내용 2": "내용 2 데이터"
                  }
              }
              ```
    - **Response**
        - **Content-Type** : text/plain
        - **Body**
            - example  
              ▷ success case
              ```text
              success
              ```  
              ▷ fail case
              ```text
              fail
              ```  
