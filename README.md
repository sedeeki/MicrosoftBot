# MicrosoftBot
Microsoft Teams Bot that replies with Hello World when message is received by it.


Steps: 

1) Download ngrok - add auth_token to it - run the command on terminal: ngrok http 3978 --host-header=“localhost:3978”
2) Have a Azure Bot resource running and change its "message endpoint" to the http ngrok provides and append "api/messages to it"
    e.g. https://251c-39-32-27-132.ngrok-free.app/api/messages 
3) Go to channels and add Microsoft Teams to Azure Bot and find "get bot embed code" where you will find a link to microsoft teams
    e.g.  https://teams.microsoft.com/l/chat/0/0?users=28:db3af811-abfd-443c-9e31-f4f2d38bd563
4) Clone this repo and adjust the application.properties with your credentials
5) Run the project and chat with the bot on the microsft teams link
