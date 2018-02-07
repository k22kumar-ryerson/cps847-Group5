import os
import time
import re

from slackclient import SlackClient
 
# Client ID
BOT_ID = 'Client ID'
 
# Bot User OAuth Access Token
slack_client = SlackClient('Bot User OAuth Access Token')

def handle_command(command, channel):
     """
         Receives commands directed at the bot and determines if they
         are valid commands. If so, then acts on the commands. If not,
         returns back what it needs for clarification.
     """
     #response = "Not sure what you mean. Use the *" + EXAMPLE_COMMAND + \
     #           "* command with numbers, delimited by spaces."
     #if command.startswith(EXAMPLE_COMMAND):
     #    response = "Sure...write some more code then I can do that!"
     #slack_client.api_call("chat.postMessage", channel=channel,
     #                      text=response, as_user=True)
 	
     slack_client.api_call("chat.postMessage", channel=channel, text=command, as_user=True)
 
def parse_slack_output(slack_rtm_output):
     """
         The Slack Real Time Messaging API is an events firehose.
         this parsing function returns None unless a message is
         directed at the Bot, based on its ID.
     """
     #TODO: Uncommment the line below to see raw messages
     print "Raw message looks like" + ' '.join(str(e) for e in slack_rtm_output)
     output_list = slack_rtm_output
     if output_list and len(output_list) > 0:
         for output in output_list:
             if output and 'text' in output and 'bot_id' not in output:
             #if output and 'text' in output and AT_BOT in output['text']:
                 # return text after the @ mention, whitespace removed
			
                 return output['text'].strip().lower(), output['channel']
                 #return output['text'].split(AT_BOT)[1].strip().lower(), \
                 #       output['channel']
     return None, None
 
if __name__ == "__main__":
     READ_WEBSOCKET_DELAY = 1 # 1 second delay between reading from firehose
     if slack_client.rtm_connect():
         print("StarterBot connected and running!")
         while True:
             command, channel = parse_slack_output(slack_client.rtm_read())
             if command and channel:
             	print "Got new message: comand = ", command, "channel = ", channel
                handle_command(command, channel)
             time.sleep(READ_WEBSOCKET_DELAY)
     else:
         print("Connection failed. Invalid Slack token or bot ID?")
